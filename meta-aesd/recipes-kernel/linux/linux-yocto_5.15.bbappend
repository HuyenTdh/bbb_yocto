FILESEXTRAPATHS:prepend := "${THISDIR}/test:"
SRC_URI += "file://enable_gpio.cfg"
SRC_URI += "file://kgdb_config.cfg"
SRC_URI += "file://gpio_enable.patch"