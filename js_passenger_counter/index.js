let saveEl = document.getElementById("save-el")
let countEl = document.getElementById("count-el")
let totalEl = document.getElementById("total-el")
let count = 0

function increment() {
    count += 1
    countEl.innerText = count
}

function save() {
    let countStr = count + " - "
    saveEl.textContent += countStr
    countEl.innerText = 0
    count = 0
}