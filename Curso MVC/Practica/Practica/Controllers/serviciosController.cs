using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace Practica.Controllers
{
    public class serviciosController : Controller
    {
        // GET: serviciosController
        public ActionResult Index()
        {
            return View();
        }

        // GET: serviciosController/Details/5
        public ActionResult Details(int id)
        {
            return View();
        }

        // GET: serviciosController/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: serviciosController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: serviciosController/Edit/5
        public ActionResult Edit(int id)
        {
            return View();
        }

        // POST: serviciosController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: serviciosController/Delete/5
        public ActionResult Delete(int id)
        {
            return View();
        }

        // POST: serviciosController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
