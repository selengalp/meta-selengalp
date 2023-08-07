SUMMARY = "Required network manager config"
DESCRIPTION = "Recipe for adding a custom network manager config file"
LICENSE = "MIT"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

do_install:append() {
    # Create the directory if it doesn't exist
    install -d ${D}${sysconfdir}/NetworkManager/conf.d/

    # Install our custom config file
    install -m 0644 ${WORKDIR}/99_selengalp_network.conf ${D}${sysconfdir}/NetworkManager/conf.d/
}

SRC_URI += "file://99_selengalp_network.conf"
