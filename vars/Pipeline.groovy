import com.enablement.Helper

// def result = slurper.parseText('{"name":"Harsh Verma","age":33,"pets":["dog","cat"]}')
def call(){
    def request = libraryResource 'com/devops/request.json' 
    def slurper = new groovy.json.JsonSlurper()
    def result = slurper.parseText(request)
    println "Pipeline called !!!!"
    println Helper.logger("Custom message ${result.name} ${result.age}")
}