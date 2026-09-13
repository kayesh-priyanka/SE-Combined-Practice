import {useState} from "react"
function App(){
 const[name , setName] = useState("")
 const[mark , setMark] = useState("")
 const[subname , subsetName] = useState("")
 const[submark , subsetMark] = useState("")
 
 return(
   <div>
    <h1>Student Marks</h1>
    <input 
      type = "text"
      placeholder = "Enter your name"
      onChange={(event)=>setName(event.target.value)}
    />
     
    <br/> <br/>
    <input 
     type = "number"
     placeholder = "Enter your mark"
     onChange={(event)=>setMark(event.target.value)}
    />

    <br/> <br/>
    
    <button onClick={()=>{subsetName(name) 
      subsetMark(mark)}}>
       Submit
    </button>
    <h3> Name : {subname}</h3>
    <h3> Mark : {submark}</h3>

         </div>
 )
}
export default App