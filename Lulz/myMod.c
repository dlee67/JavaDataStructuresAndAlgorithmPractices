#include <linux/module.h>
#include <linux/kernel.h>
#include <linux/init.h>
#include <linux/moduleparam.h>
#include <linux/stat.h>

static int myInt = 3;
module_param(myInt, int, S_IRUSR | S_IWUSR | S_IRGRP | S_IROTH);
MODULE_PARM_DESC(myInt, "myInt stores an integer value passed to this kernel module.");

//int intArray[2];
//module_param_array(intArray, int, NULL, 0);

//int shortArray[4];
//int count;
//module_param_array(shortArray, short, count, 0); 

int init_module(void)
{
	printk(KERN_INFO "Hello, module\n");
	printk(KERN_INFO "The integer on the right has been passed: %d", myInt);
	return 0;
}

void cleanup_module(void)
{
	printk(KERN_INFO"Logging out.\n");
}

/*
	module_init() and module_exit() exists for the sake of being able to rename the init and cleanup modules.
*/
//module_init(hello_module);
//module_exit(good_bye_module);
