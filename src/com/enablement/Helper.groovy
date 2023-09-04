package com.enablement

def request = libraryResource 'com/enablement/devops/request.json' 
def slurper = new groovy.json.JsonSlurper()
def result = slurper.parseText(request)

class Helper{
  public static logger(msg){
    return "Message from Logger helper method ${msg} ${result.name} ${result.age}"
  }
}