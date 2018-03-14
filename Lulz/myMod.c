#include <linux/module.h>
#include <linux/kernel.h>
#include <linux/init.h>

int hello_module(void)
{
	printk(KERN_INFO "Hello, module\n");
	return 0;
}

void good_bye_module(void)
{
	printk(KERN_INFO"Logging out.\n");
}

module_init(hello_module);
module_exit(good_bye_module);
