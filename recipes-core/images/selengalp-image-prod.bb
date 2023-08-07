SUMMARY = "A small image customized by selengalp"
LICENSE = "MIT"


inherit core-image

IMAGE_FSTYPES = "rpi-sdimg.gz ext4"

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE ?= "1000000"

# Add base packages
IMAGE_INSTALL:append = " chrony"
IMAGE_INSTALL:append = " openssh"
IMAGE_INSTALL:append = " networkmanager"
IMAGE_INSTALL:append = " netplan"
IMAGE_INSTALL:append = " k3s k3s-server"
IMAGE_INSTALL:append = " kernel-modules"
IMAGE_INSTALL:append = " ca-certificates"
