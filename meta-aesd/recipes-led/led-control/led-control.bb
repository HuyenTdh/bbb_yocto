SUMMARY = "Example of how to build an external Linux kernel module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit module

S = "${WORKDIR}/git"

INITSCRIPT_PACKAGES = "${PN}"

EXTRA_OEMAKE:append:task-compile = " -C ${STAGING_KERNEL_DIR} M=${S}"
EXTRA_OEMAKE += "KERNELDIR=${STAGING_KERNEL_DIR}"

SRC_URI = "git://git@github.com/HuyenTdh/LED_control.git;protocol=ssh;branch=gpio_interrupt"
PV = "1.0+git${SRCPV}"
SRCREV = "8b356bd625a93488dca61a40fc7f3c635133184e"