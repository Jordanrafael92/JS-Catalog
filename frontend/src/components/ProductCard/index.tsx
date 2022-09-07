import ProductImg from 'assets/images/product.png';
import './styles.css';

const ProductCard = () => {
    return(
        <div className="base-card product-card">
            <div className="card-top-container">
                <img src={ProductImg} alt="Nome do Produto" />
            </div>
            <div className="card-bottom-container">
                <h6>Nome do Produto</h6>
                <p>3987,55</p>
            </div>
        </div>
    );
}
export default ProductCard;