Name:    Virat Mishra
Roll no: 2019201033

Instructions for execution:

### Install/Update Java
      * sudo add-apt-repository ppa:openjdk-r/ppa
      * sudo apt-get update -q 
      * sudo apt install -y openjdk-11-jdk 

### For The Main File

      * Clone this repo 
      * install ant by running 'sudo apt-get install ant'
      * then go to the folder where you have cloned this repo
      * run ./compile.sh
      * run 'java -cp build/jar/args.jar com.cleancoder.args.ArgsMain'
### For the tests
        * Run the command given below from the root folder of this repo
        * ./runTests.sh

    
This is the java version of the Args program described in: http://butunclebob.com/ArticleS.UncleBob.CleanCodeArgs

Reference repo : https://github.com/unclebob/javaargs

Schema:
 - char    - Boolean arg.
 - char*   - String arg.
 - char#   - Integer arg.
 - char##  - double arg.
 - char[*] - one element of a string array.

Example schema: (f,s*,n#,a##,p[*])
Coresponding command line: "f,s*,n#,a##,p[*] -f -s Bob -n 1 -a 3.2 -p e1 -p e2 -p e3"


  Changelog:

->Created a bash script to compile and build.

->Slight adjustments to indentation for better code readability.

->Included a function to print values of all command line arguments.

->A new instance_validator method in ArgumentMarshaler classes of all supported types.

->In place of precoded schema, custom schema will be fed as input preceeding the actual command line arguments.

->Added unit test cases.
