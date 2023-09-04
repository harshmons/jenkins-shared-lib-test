package com.enablement

class Helper{
  public static logger(msg){
    def request = libraryResource 'com/devops/request.json' 
    def slurper = new groovy.json.JsonSlurper()
    def result = slurper.parseText(request)
    return "Message from Logger helper method ${msg} Age - ${result.age}"
  }
}