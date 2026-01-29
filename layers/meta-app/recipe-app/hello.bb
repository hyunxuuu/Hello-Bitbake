DESCRIPTION = "Prints Hello World"
PN = 'hello'
PV = '1'

python do_hello() {
   bb.plain("********************");
   bb.plain("*                  *");
   bb.plain("*  Hello, World!   *");
   bb.plain("*                  *");
   bb.plain("********************");
}

addtask hello before do_build