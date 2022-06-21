var botaoalternador = document.querySelector('.js-botao');

botaoalternador.onclick = function(){
    var menu = document.querySelector('.js-menu');
    menu.classList.toggle('esta-alternado');
    
}