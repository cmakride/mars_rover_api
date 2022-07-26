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

marsApiButtons.forEach(button => button.addEventListener('click', function () {
  let buttonId = button.id
  let currentId = buttonId.split("marsApi")
  const roverId = currentId[1]
  let apiData = document.getElementById('marsApiRoverData')
  apiData.value = roverId.toLowerCase()
  // so what should happen is when form is submitted we should get access to that data in the body of the post, which is in homecontroller PostMapping
  document.getElementById('formRoverType').submit()
}))

//accessing the url to find out what rover currently on so can change the button color
function getUrlParameter(name) {
  name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]')
  var regex = new RegExp('[\\?&]' + name + '=([^&#]*)')
  var results = regex.exec(location.search)
  return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '))
}

let marsRoverType = getUrlParameter("marsApiRoverData")
marsRoverType = capitalizeFirstLetter(marsRoverType)

//? Change the color of the button
highLightBtnByRoverType(marsRoverType)

// Functions
function highLightBtnByRoverType(roverType) {
  if (roverType == '') {
    roverType = "Opportunity"
  }
  document.getElementById(`marsApi${roverType}`).classList.remove('btn-secondary')
  document.getElementById(`marsApi${roverType}`).classList.add('btn-primary')
}

function capitalizeFirstLetter(string) {
  return string.charAt(0).toUpperCase() + string.slice(1);
}