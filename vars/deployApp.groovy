#!/usr/bin/groovy

def call(project, app, tag){
    sh "oc new-app --name=${app} -n ${project} --image-stream=${project}/${app}:${tag} || echo 'Aplication already Exists'"
    sh "oc expose service ${app} -n ${project} || echo 'Service already exposed'"
}
