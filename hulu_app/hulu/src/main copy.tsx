import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import 'bootstrap/dist/css/bootstrap.min.css'
import Dashboard from './dashboard/dashboard'

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <h1>Entertainment everyday</h1>
    <h1>Bundle plans starting at 12.99$</h1>
    <div className="container">
      <div className="row justify-content-center mt-4">
        <div className="col-auto d-flex gap-3">
          <Dashboard />
          <Dashboard />
        </div>
      </div>
    </div>
  </StrictMode>
)

