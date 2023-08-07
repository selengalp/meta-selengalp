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

# Add some tools for debugging
IMAGE_INSTALL:append = " nano"
IMAGE_INSTALL:append = " htop"
IMAGE_INSTALL:append = " pstree"
IMAGE_INSTALL:append = " iotop"
IMAGE_INSTALL:append = " iftop"
IMAGE_INSTALL:append = " grep"
IMAGE_INSTALL:append = " curl"
IMAGE_INSTALL:append = " wget"
IMAGE_INSTALL:append = " tcpdump"

EXTRA_IMAGE_FEATURES ?= "debug-tweaks"