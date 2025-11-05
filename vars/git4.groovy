def call(String branch,String url){
  echo "this is cloning the code etc"
  git branch: "${branch}", url: "${url}"
  echo "the code clone successfully etc"
}
  
