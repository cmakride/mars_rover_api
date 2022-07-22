// Rover Buttons
// const curiosity = document.getElementById("marsApiCuriosity")
// const opportunity = document.getElementById("marsApiOpportunity")
// const spirit = document.getElementById("marsApiSpirit")

// // Event Listeners
// curiosity.addEventListener("click",()=>{
//   console.log("CURIOUSITY")
// })

// opportunity.addEventListener("click",()=>{
//   console.log("OPPORTUNITY")
// })

// spirit.addEventListener("click",()=>{
//   console.log("SPIRIT")
// })

// Improved Syntax for doing same thing as above
const marsApiButtons = document.querySelectorAll("button[id*='marsApi']")

marsApiButtons.forEach( button => button.addEventListener('click',function(){
  let buttonId = button.id
  console.log(buttonId)
  let currentId = buttonId.split("marsApi")
  console.log(typeof currentId[1])
}))