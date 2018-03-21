obj-m += myMod.o
#Below line enables multiple object files to be created.
#obj-m += urMod.o

KDIR = /usr/src/linux-headers-4.13.0-37-generic

all:
	$(MAKE) -C $(KDIR) M=$(PWD) modules

clean:
	rm *.o *.out *.sym* *.order *.mod* *.ko
	
