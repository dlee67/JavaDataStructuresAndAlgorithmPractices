obj-m += myMod.o

KDIR = /usr/src/linux-headers-4.13.0-36-generic

all:
	$(MAKE) -C $(KDIR) M=$(PWD) modules

clean:
	rm *.o *.out *.sym* *.order *.mod* *.ko
	
