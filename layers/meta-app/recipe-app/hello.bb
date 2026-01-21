DESCRIPTION = "Prints Hello Bitbake"

python do_hello() {
   bb.plain("*********************");
   bb.plain("*                   *");
   bb.plain("*  Hello, Bitbake!  *");
   bb.plain("*                   *");
   bb.plain("*********************");
}

addtask do_hello before do_build