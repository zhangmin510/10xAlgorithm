
array:	file format Mach-O 64-bit x86-64

Disassembly of section __TEXT,__text:
__text:
100000ec0:	55 	pushq	%rbp
100000ec1:	48 89 e5 	movq	%rsp, %rbp
100000ec4:	48 83 ec 30 	subq	$48, %rsp
100000ec8:	31 c0 	xorl	%eax, %eax
100000eca:	b9 0c 00 00 00 	movl	$12, %ecx
100000ecf:	89 ca 	movl	%ecx, %edx
100000ed1:	4c 8d 45 ec 	leaq	-20(%rbp), %r8
100000ed5:	4c 8b 0d 34 01 00 00 	movq	308(%rip), %r9
100000edc:	4d 8b 09 	movq	(%r9), %r9
100000edf:	4c 89 4d f8 	movq	%r9, -8(%rbp)
100000ee3:	c7 45 e8 00 00 00 00 	movl	$0, -24(%rbp)
100000eea:	89 7d e4 	movl	%edi, -28(%rbp)
100000eed:	48 89 75 d8 	movq	%rsi, -40(%rbp)
100000ef1:	c7 45 d4 00 00 00 00 	movl	$0, -44(%rbp)
100000ef8:	4c 89 c7 	movq	%r8, %rdi
100000efb:	89 c6 	movl	%eax, %esi
100000efd:	e8 62 00 00 00 	callq	98
100000f02:	83 7d d4 03 	cmpl	$3, -44(%rbp)
100000f06:	0f 8f 2b 00 00 00 	jg	43 <_main+0x77>
100000f0c:	48 8d 3d 8b 00 00 00 	leaq	139(%rip), %rdi
100000f13:	48 63 45 d4 	movslq	-44(%rbp), %rax
100000f17:	c7 44 85 ec 00 00 00 00 	movl	$0, -20(%rbp,%rax,4)
100000f1f:	b0 00 	movb	$0, %al
100000f21:	e8 44 00 00 00 	callq	68
100000f26:	89 45 d0 	movl	%eax, -48(%rbp)
100000f29:	8b 45 d4 	movl	-44(%rbp), %eax
100000f2c:	83 c0 01 	addl	$1, %eax
100000f2f:	89 45 d4 	movl	%eax, -44(%rbp)
100000f32:	e9 cb ff ff ff 	jmp	-53 <_main+0x42>
100000f37:	48 8b 05 d2 00 00 00 	movq	210(%rip), %rax
100000f3e:	48 8b 00 	movq	(%rax), %rax
100000f41:	48 8b 4d f8 	movq	-8(%rbp), %rcx
100000f45:	48 39 c8 	cmpq	%rcx, %rax
100000f48:	0f 85 08 00 00 00 	jne	8 <_main+0x96>
100000f4e:	31 c0 	xorl	%eax, %eax
100000f50:	48 83 c4 30 	addq	$48, %rsp
100000f54:	5d 	popq	%rbp
100000f55:	c3 	retq
100000f56:	e8 03 00 00 00 	callq	3
100000f5b:	0f 0b 	ud2

_main:
100000ec0:	55 	pushq	%rbp
100000ec1:	48 89 e5 	movq	%rsp, %rbp
100000ec4:	48 83 ec 30 	subq	$48, %rsp
100000ec8:	31 c0 	xorl	%eax, %eax
100000eca:	b9 0c 00 00 00 	movl	$12, %ecx
100000ecf:	89 ca 	movl	%ecx, %edx
100000ed1:	4c 8d 45 ec 	leaq	-20(%rbp), %r8
100000ed5:	4c 8b 0d 34 01 00 00 	movq	308(%rip), %r9
100000edc:	4d 8b 09 	movq	(%r9), %r9
100000edf:	4c 89 4d f8 	movq	%r9, -8(%rbp)
100000ee3:	c7 45 e8 00 00 00 00 	movl	$0, -24(%rbp)
100000eea:	89 7d e4 	movl	%edi, -28(%rbp)
100000eed:	48 89 75 d8 	movq	%rsi, -40(%rbp)
100000ef1:	c7 45 d4 00 00 00 00 	movl	$0, -44(%rbp)
100000ef8:	4c 89 c7 	movq	%r8, %rdi
100000efb:	89 c6 	movl	%eax, %esi
100000efd:	e8 62 00 00 00 	callq	98
100000f02:	83 7d d4 03 	cmpl	$3, -44(%rbp)
100000f06:	0f 8f 2b 00 00 00 	jg	43 <_main+0x77>
100000f0c:	48 8d 3d 8b 00 00 00 	leaq	139(%rip), %rdi
100000f13:	48 63 45 d4 	movslq	-44(%rbp), %rax
100000f17:	c7 44 85 ec 00 00 00 00 	movl	$0, -20(%rbp,%rax,4)
100000f1f:	b0 00 	movb	$0, %al
100000f21:	e8 44 00 00 00 	callq	68
100000f26:	89 45 d0 	movl	%eax, -48(%rbp)
100000f29:	8b 45 d4 	movl	-44(%rbp), %eax
100000f2c:	83 c0 01 	addl	$1, %eax
100000f2f:	89 45 d4 	movl	%eax, -44(%rbp)
100000f32:	e9 cb ff ff ff 	jmp	-53 <_main+0x42>
100000f37:	48 8b 05 d2 00 00 00 	movq	210(%rip), %rax
100000f3e:	48 8b 00 	movq	(%rax), %rax
100000f41:	48 8b 4d f8 	movq	-8(%rbp), %rcx
100000f45:	48 39 c8 	cmpq	%rcx, %rax
100000f48:	0f 85 08 00 00 00 	jne	8 <_main+0x96>
100000f4e:	31 c0 	xorl	%eax, %eax
100000f50:	48 83 c4 30 	addq	$48, %rsp
100000f54:	5d 	popq	%rbp
100000f55:	c3 	retq
100000f56:	e8 03 00 00 00 	callq	3
100000f5b:	0f 0b 	ud2
Disassembly of section __TEXT,__stubs:
__stubs:
100000f5e:	ff 25 b4 00 00 00 	jmpq	*180(%rip)
100000f64:	ff 25 b6 00 00 00 	jmpq	*182(%rip)
100000f6a:	ff 25 b8 00 00 00 	jmpq	*184(%rip)
Disassembly of section __TEXT,__stub_helper:
__stub_helper:
100000f70:	4c 8d 1d 91 00 00 00 	leaq	145(%rip), %r11
100000f77:	41 53 	pushq	%r11
100000f79:	ff 25 81 00 00 00 	jmpq	*129(%rip)
100000f7f:	90 	nop
100000f80:	68 00 00 00 00 	pushq	$0
100000f85:	e9 e6 ff ff ff 	jmp	-26 <__stub_helper>
100000f8a:	68 18 00 00 00 	pushq	$24
100000f8f:	e9 dc ff ff ff 	jmp	-36 <__stub_helper>
100000f94:	68 26 00 00 00 	pushq	$38
100000f99:	e9 d2 ff ff ff 	jmp	-46 <__stub_helper>
