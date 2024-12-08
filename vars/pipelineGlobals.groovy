def getAccountID(String environment) {
    switch(environment) {
        case 'dev':
            return "022499022353"
        case 'qa':
            return "022499022353"
        case 'uat':
            return "022499022353"
        case 'pre-prod':
            return "022499022353"
        case 'prod':
            return "022499022353"
        default:
            return "nothing"
    }
}