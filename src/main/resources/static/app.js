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