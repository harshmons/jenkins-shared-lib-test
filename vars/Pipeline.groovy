import com.enablement.Helper

def call(){
    def request = libraryResource 'com/devops/request.json' 
    def slurper = new groovy.json.JsonSlurper()
    def result = slurper.parseText(request)
    println "Pipeline called !!!!!!!!"
    println new Helper().logger("Custom message Name - ${result.name} Age ---- ${result.age}")
}