import { useEffect, useState } from "react";
import axios from "axios";

export function Flipkart() {
  const [product, setProduct] = useState({
    title: "",
    image: "",
    price: 0,
    rating: {
      rate: 0,
      ratings: 0,
      reviews: 0,
    },
    offers: [],
  });

  function loadData() {
    axios
      .get("/product.json")
      .then((response) => {
        setProduct(response.data);
      })
      .catch((error) => {
        console.error("Error loading product data:", error);
      });
  }

  useEffect(() => {
    loadData();
  }, []);

  return (
    <div>
      <h2>{product.title}</h2>
      <img src={product.image} width="200" />
      <p>₹{product.price}</p>
    </div>
  );
}
