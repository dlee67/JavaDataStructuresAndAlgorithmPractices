#include <linux/init.h>
#include <linux/kernel.h>
#include <linux/module.h>

int init_module(void){
	printk(KERN_INFO "nani!?");
	return 0;
}

void cleanup_module(void){
	printk(KERN_INFO "MASAKA!??!??");
}

