import com.enablement.Helper
import groovy.json.JsonSlurper

def request = libraryResource 'com/devops/request.json' 
// def result = slurper.parseText('{"name":"Harsh Verma","age":33,"pets":["dog","cat"]}')
def call(){
    def slurper = new JsonSlurper()
    def result = slurper.parseText(request)
    println "Pipeline called !!!!"
    println Helper.logger("Custom message ${result.name}")
}