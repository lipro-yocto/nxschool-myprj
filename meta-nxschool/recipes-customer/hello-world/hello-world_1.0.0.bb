SUMMARY = "Hello World"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://hello-world.cpp"

TARGET_CC_ARCH += "${LDFLAGS}"
S = "${WORKDIR}"

do_compile() {
    ${CXX} -Wall hello-world.cpp -o hello-world
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/hello-world ${D}${bindir}
}
