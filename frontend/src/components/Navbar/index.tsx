import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './style.css';

export default function Navbar(){
    return(
        <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>DSMovie</h1>
          <a href="https://github.com/HeriSanDev">
              <div className="dsmovie-contact-container">
                  <GithubIcon />
                  <p>/HeriSanDev</p>
              </div>
          </a>
        </div>
      </nav>
    </header>
    );
}