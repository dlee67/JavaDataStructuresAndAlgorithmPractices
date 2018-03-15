#include <linux/module.h>
#include <linux/kernel.h>
#include <linux/init.h>

int init_module(void)
{
	printk(KERN_INFO "Hello, module\n");
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
