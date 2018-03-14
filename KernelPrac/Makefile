obj-m += hello-1.o

KDIR = /usr/src/linux-headers-4.13.0-36-generic
# The $(MAKE) represents the 'make' token, where the $(KDIR) get's directyly fetched from the above.
# https://github.com/torvalds/linux/blob/master/Documentation/kbuild/modules.txt
# As stated in the 2.1, from the above link, it's an obligation for me insert the path_to_kernel_src.
# The $(PWD) is the current working directory, urg... I guess I gotta come back.
# SUBDIRS is equivalent to M, according to https://stackoverflow.com/questions/21129224/subdirs-variable-in-kernel-module-makefile
# but the modules is the build target.
all:
	$(MAKE) -C $(KDIR) SUBDIRS=$(PWD) modules

clean:
	rm -rf *.o *.ko *.mod.* *.symvers *.order

