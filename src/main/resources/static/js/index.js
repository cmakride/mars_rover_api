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
  let currentId = buttonId.split("marsApi")
  const roverId = currentId[1]
  let apiData = document.getElementById('marsApiRoverData')
  apiData.value = roverId.toLowerCase()
  console.log(apiData.value)
  // so what should happen is when form is submitted we should get access to that data in the body of the post, which is in homecontroller PostMapping
  document.getElementById('formRoverType').submit()
}))