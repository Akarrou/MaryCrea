const ratio = .1
const options = {
    root: null,
    rootMargin: '0px',
    threshold: ratio
};
const handlIntersect = function (entries, observer) {
    entries.forEach(function (entry) {

        if (entry.intersectionRatio > ratio) {
            entry.target.classList.add('reveal-visible')
            observer.unobserve(entry.target)
        }

    })
}
const observer = new IntersectionObserver(handlIntersect, options);
document.querySelectorAll('.reveal').forEach(function(r){
    observer.observe(r)
})

var content = document.querySelector('#hamburger-content');
var sidebarBody = document.querySelector('#hamburger-sidebar-body');

sidebarBody.innerHTML = content.innerHTML;
var button = document.querySelector('#hamburger-button');
var overlay = document.querySelector('#hamburger-overlay');
var activatedClass = 'hamburger-activated';

button.addEventListener('click', function(e) {
    e.preventDefault();

    this.parentNode.classList.add(activatedClass);
});

button.addEventListener('keydown', function(e) {
    if (this.parentNode.classList.contains(activatedClass))
    {
        if (e.repeat === false && e.which === 27)
            this.parentNode.classList.remove(activatedClass);
    }
});

overlay.addEventListener('click', function(e) {
    e.preventDefault();

    this.parentNode.classList.remove(activatedClass);
});