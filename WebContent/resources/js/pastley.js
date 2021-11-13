const LSY_CLASS_ACTIVE = "lsy-option-active";

const pastleyMenuHome = (id) => {
	let drop = document.querySelector(`${id} .lsy-menu-home-link__drop`);
	let btnMenuClose = document.querySelector(`${id} .lsy-btn-close`);
	let grid= document.querySelector(`${id} .lsy-menu-home-container__grid`);
	let link = document.querySelector(`${id} .lsy-menu-home-link`);
	let products = document.querySelector(`${id} .lsy-menu-home-container__grid-products`);
	let isMovil = () => window.innerWidth <= 800;
	
	if(drop != null){
		drop.addEventListener('mouseover', () => {
			if(!isMovil()){
				grid.classList.add(LSY_CLASS_ACTIVE);
			}
		});
		
		grid.addEventListener('mouseleave', () => {
			if(!isMovil()){
				grid.classList.remove(LSY_CLASS_ACTIVE);
			}	
		});
		
		document.querySelectorAll(`${id} .lsy-menu-home-container__grid-categories a`).forEach((element) => {
			element.addEventListener('mouseenter', (e) => {
				if(!isMovil()){
					document.querySelectorAll(`${id} .lsy-menu-home-container__grid-products-product`).forEach((c) => {
						c.classList.remove(LSY_CLASS_ACTIVE);
						if(c.dataset.categoria === e.target.dataset.categoria){
							c.classList.add(LSY_CLASS_ACTIVE);
						}
					});
				}
			});
		});
		
		document.querySelector(`${id} .lsy-btn-bars`).addEventListener('click', (e) => {
			e.preventDefault();
			if(link.classList.contains(LSY_CLASS_ACTIVE)){
				link.classList.remove(LSY_CLASS_ACTIVE);
				document.querySelector('body').style.overflow = 'visible';
			} else {
				link.classList.add(LSY_CLASS_ACTIVE);
				document.querySelector('body').style.overflow = 'hidden';
			}
		});
		
		drop.addEventListener('click', (e) => {
			e.preventDefault();
			grid.classList.add(LSY_CLASS_ACTIVE);
			btnMenuClose.classList.add(LSY_CLASS_ACTIVE);
		});
		
		document.querySelector(`${id} .lsy-menu-home-container__grid-categories .lsy-btn-before`).addEventListener('click', (e) => {
			e.preventDefault();
			grid.classList.remove(LSY_CLASS_ACTIVE);
			btnMenuClose.classList.remove(LSY_CLASS_ACTIVE);
		});
		
		document.querySelectorAll(`${id} .lsy-menu-home-container__grid-categories a`).forEach((elemento) => {
			elemento.addEventListener('click', (e) => {
				if(isMovil()){
					products.classList.add(LSY_CLASS_ACTIVE);
					document.querySelectorAll(`${id} .lsy-menu-home-container__grid-products-product`).forEach((c) => {
						c.classList.remove(LSY_CLASS_ACTIVE);
						if(c.dataset.categoria == e.target.dataset.categoria){
							c.classList.add(LSY_CLASS_ACTIVE);
						}
					});
				}
			});
		});
		
		document.querySelectorAll(`${id} .lsy-menu-home-container__grid-products-product .lsy-btn-before`).forEach((btn) => {
			btn.addEventListener('click', (e) => {
				e.preventDefault();
				products.classList.remove(LSY_CLASS_ACTIVE);
			});
		});
		
		btnMenuClose.addEventListener('click', (e)=> {
			e.preventDefault();
			document.querySelectorAll(`${id} .${LSY_CLASS_ACTIVE}`).forEach((elemento) => {
				elemento.classList.remove(LSY_CLASS_ACTIVE);
			});
			document.querySelector('body').style.overflow = 'visible';
		});
	}
}

const pastleyMenuLeft = (id) =>{
	let menu = document.querySelector(`${id}`);
	if(menu != null){
		let items = menu.querySelectorAll(".lsy-menu-user-left__item-accordion > a");
		if(items != null){
			items.forEach((e) => {
				e.addEventListener("click", (ev) => {
					ev.preventDefault();
					let parent = e.parentNode;
					if(parent != null){
						let ul = parent.querySelector("UL");
						parent.classList.toggle(LSY_CLASS_ACTIVE);
						if(ul != null){
							ul.classList.toggle(LSY_CLASS_ACTIVE);
						}
					}
				});
			});
		}
	}
}