SUMMARY = "Recipe for  build an external axi-tangxi Linux kernel module"
SECTION = "PETALINUX/modules"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

INHIBIT_PACKAGE_STRIP = "1"

SRC_URI = "file://Makefile \
           file://axi_tangxi.c \
           file://axitangxi_dev.c \
           file://axi_tangxi_platform.c\
           file://axitangxi_dev.h \
           file://axitangxi_ioctl.h \
	   file://COPYING \
          "

S = "${WORKDIR}"
KERNEL_MODULE_AUTOLOAD += "axi-tangxi"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
