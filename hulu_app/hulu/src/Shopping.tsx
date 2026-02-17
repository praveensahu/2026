import axios from "axios";
import { useEffect, useState } from "react";

export function Shopping() {

  const [categories, setCategories] = useState([]);
  const [products, setProducts] = useState([]);
  const [brands] = useState(["Levis", "US POLO", "Nike", "Puma"]);

  function LoadCategories() {
  axios.get("https://fakestoreapi.com/products/categories")
    .then(response => {
      setCategories(["all", ...response.data]);
    });
}


  function LoadProducts() {
    axios.get("https://fakestoreapi.com/products")
      .then(response => {
        setProducts(response.data);
      });
  }

  useEffect(() => {
    LoadCategories();
    LoadProducts();
  }, []);

  return (
    <div className="container-fluid">

      {/* HEADER */}
      <header className="d-flex bg-light justify-content-between p-3 align-items-center">
        <div>
          <span className="bi bi-bag fs-4 fw-bold"> Shopping </span>
        </div>

        <div>
          <div className="input-group">
            <span className="input-group-text bi bi-search"></span>
            <input type="text" placeholder="search products" className="form-control" />
          </div>
        </div>

        <div>
          <button className="btn">New Arrivals</button>
          <button className="btn">Best Sellers</button>
          <button className="btn btn-secondary bi bi-person mx-1"></button>
          <button className="btn btn-secondary bi bi-heart mx-1"></button>
        </div>
      </header>

      {/* BODY */}
      <section className="mt-3">
        <div className="row">

          {/* FILTER */}
          <div className="col-2 bg-light p-3">
            <h4>Filter Products</h4>

            <label className="form-label fw-bold">Category</label>
            <select className="form-select">
              {categories.map(category =>
                <option key={category}>{category}</option>
              )}
            </select>

            <div className="my-4">
              <label className="form-label fw-bold">Brands</label>
              <ul className="list-unstyled">
                {brands.map(brand =>
                  <li key={brand}>
                    <input type="checkbox" className="form-check-input me-2" />
                    {brand}
                  </li>
                )}
              </ul>
            </div>

            <div>
              <label className="form-label fw-bold">Price</label>
              <input type="range" className="form-range" min="1" max="1000" />
            </div>

          </div>

          {/* PRODUCTS */}
          <div className="col-10">
            <main className="d-flex flex-wrap overflow-auto" style={{ height: "700px" }}>
              {products.map(product =>
                <div key={product.id} className="card m-2 p-2" style={{ width: "200px" }}>
                  <img src={product.image} className="card-img-top" height="120" alt="" />

                  <div className="card-header overflow-auto" style={{ height: "100px" }}>
                    {product.title}
                  </div>

                  <div className="card-body">
                    <p>
                      ₹ {product.price}
                    </p>
                    <p>
                      {product.rating?.rate}
                      <span className="bi bi-star-fill text-success ms-1"></span>
                    </p>
                  </div>

                  <div className="card-footer">
                    <button className="btn btn-warning w-100 bi bi-cart4">
                      Add to Cart
                    </button>
                  </div>
                </div>
              )}
            </main>
          </div>

        </div>
      </section>

    </div>
  );
}
