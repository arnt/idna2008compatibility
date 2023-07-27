Finding strings that are valid in IDNA2003 and not in IDNA2008
==============================================================

This is a small program to find those codepoints that form valid domain
labels when using IDNA2003, but not when using IDNA2008.

This version uses completely independent implementations, namely JDK's
IDNA2003 and libidn2's IDNA2008.

Note that some of the strings are potentially valid in IDNA2008. For
example a COMBINING RING ABOVE is valid directly after most letters but
invalid at the start of the string.
