﻿using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Data.Entity.Infrastructure;
using System.Data.SqlClient;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Threading.Tasks;
using System.Web.Http;
using System.Web.Http.Description;
using WebAPI.EntityFramework;

namespace WebAPI.Controllers
{
    public class RETRIVALController : ApiController
    {
        private APIDbContext db = new APIDbContext();

        [HttpGet]
        public List<RETRIVAL> FindAllRetrival()
        {
            var res = db.Database.SqlQuery<RETRIVAL>("sp_FindAllRetrival").ToList();
            return res;
        }

        [HttpGet]
        public RETRIVAL FindRetrival(string retrivalCode)
        {
            object[] paremeter = 
                {
                    new SqlParameter("@RetrivalCode", retrivalCode)
                };
            RETRIVAL res = db.Database.SqlQuery<RETRIVAL>("sp_GetRetrival @RetrivalCode", paremeter).FirstOrDefault();
            return res;
        }

        [HttpGet]
        public List<RETRIVAL> FindRetrivalElement(string searchString)
        {
            object[] parameter =
                {
                    new SqlParameter("@Element", searchString)
                };

            var res = db.Database.SqlQuery<RETRIVAL>("exec sp_FindRetrivalElement @Element", parameter).ToList();
            return res;
        }

        [ResponseType(typeof(void))]
        public async Task<IHttpActionResult> PutRETRIVAL(string id, RETRIVAL rETRIVAL)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(ModelState);
            }

            if (id != rETRIVAL.RetrivalCode)
            {
                return BadRequest();
            }

            db.Entry(rETRIVAL).State = EntityState.Modified;

            try
            {
                await db.SaveChangesAsync();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!RETRIVALExists(id))
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }

            return StatusCode(HttpStatusCode.NoContent);
        }

        // POST: api/AGENT
        [ResponseType(typeof(RETRIVAL))]
        public async Task<IHttpActionResult> PostRETRIVAL(RETRIVAL rETRIVAL)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(ModelState);
            }

            db.RETRIVAL.Add(rETRIVAL);

            try
            {
                await db.SaveChangesAsync();
            }
            catch (DbUpdateException)
            {
                if (RETRIVALExists(rETRIVAL.RetrivalCode))
                {
                    return Conflict();
                }
                else
                {
                    throw;
                }
            }

            return CreatedAtRoute("DefaultApi", new { id = rETRIVAL.RetrivalCode }, rETRIVAL);
        }

        // DELETE: api/AGENT/5
        [ResponseType(typeof(RETRIVAL))]
        public async Task<IHttpActionResult> DeleteRETRIVAL(string id)
        {
            RETRIVAL rETRIVAL = await db.RETRIVAL.FindAsync(id);
            if (rETRIVAL == null)
            {
                return NotFound();
            }

            db.RETRIVAL.Remove(rETRIVAL);
            await db.SaveChangesAsync();

            return Ok(rETRIVAL);
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }

        private bool RETRIVALExists(string id)
        {
            return db.RETRIVAL.Count(e => e.RetrivalCode == id) > 0;
        }
    }
}