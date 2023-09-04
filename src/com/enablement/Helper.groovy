package com.enablement

// import groovy.json.JsonSlurper
// // def request = libraryResource 'com/devops/request.json' 
// def slurper = new JsonSlurper()
// def result = slurper.parseText('{"name":"Harsh Verma","age":33,"pets":["dog","cat"]}')
// // def result = slurper.parseText(request)
def result = [
  name:'Harsh Verma',
  age:23
]
class Helper{
  public static logger(msg){
    return "Message from Logger helper method ${msg} ${result.name} ${result.age}"
  }
}