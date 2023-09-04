import com.enablement.Helper
// import groovy.json.JsonSlurper
// // def request = libraryResource 'com/devops/request.json' 
// def slurper = new JsonSlurper()
// def result = slurper.parseText('{"name":"Harsh Verma","age":33,"pets":["dog","cat"]}')
// // def result = slurper.parseText(request)
def result = [
  name:'Harsh Verma',
  age:23
]
def call(){
    println "Pipeline called !!!!"
    println Helper.logger("Custom message ${result.name}")
}