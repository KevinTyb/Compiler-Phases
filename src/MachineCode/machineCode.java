/*package MachineCode;

import IRGen.IntermediateCode;
import org.objectweb.asm.*;

*** The following is a very simplified machine code generation fro the intermediate representaion ***

public class machineCode {
    public byte[] generateBytecode (IntermediateCode intermediateCode) {
        // Enable computation of stack map frames to perform bytecode verification at runtime
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        // Enable access level to method using public adnd static
        // main method takes array of strings and returns void
        MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
        "main", "([Ljava/lang/String;)V", null, null);

        // Generate bytecode instructions corresponding to the intermediate code
        for (Instruction instruction : intermediateCode.getInstructions()) {
            switch (instruction,getOpcode()) {
                case ADD;
                    mv.visitInsn(Opcodes.IADD);
                    break;
            case SUB;
                    mv.visitInsn(Opcodes.ISUB);
                    break;
            case MULT;
                    mv.visitInsn(Opcodes.IMULT);
                    break;
            case DIV;
                    mv.visitInsn(Opcodes.IDIV);
                    break;
            case CONDITIONALEXP;
                    mv.visitInsn(Opcodes.ICONDITIONALEXP);
                    break;
            case CONDITIONALOREXP;
                    mv.visitInsn(Opcodes.ICONDITIONALOREXP);
                    break;
            case CONDITIONALANDEXP;
                    mv.visitInsn(Opcodes.ICONDITIONALANDEXP);
                    break;
            case INCLUSIVEOREXP;
                    mv.visitInsn(Opcodes.IINCLUSIVEOREXP);
                    break;
            case EXCLUSIVEOREXP;
                    mv.visitInsn(Opcodes.EXCLUSIVEOREXP);
                    break;
            case ANDEXP;
                    mv.visitInsn(Opcodes.IANDEXP);
                    break;
            case EQEXPR;
                    mv.visitInsn(Opcodes.IEQEXPR);
                    break;
            case RELATIONALEXP;
                    mv.visitInsn(Opcodes.IRELATIONALEXP);
                    break;
            case SHIFTEXP;
                    mv.visitInsn(Opcodes.ISHIFTEXP);
                    break;
            case UNARYEXP;
                    mv.visitInsn(Opcodes.IUNARYEXP);
                    break;
            case UNARYEXPNOTPLUSMINUS;
                    mv.visitInsn(Opcodes.IUNARYEXPNOTPLUSMINUS);
                    break;
            case PREINCREMENTEXP;
                    mv.visitInsn(Opcodes.IPREINCREMENTEXP);
                    break;
            case PREDECREMENTEXP;
                    mv.visitInsn(Opcodes.IPREDECREMENTEXP);
                    break;
            }
        }

        mv.visitInsn(Opcodes.RETURN); // Bytecode instruction for returning a method
        mv.visitMaxs(0,0); // set max stack size and var size for generated method
        mv.visitEnd(); // Generation of current method is complete

        cw.visitEnd()l

        return cw.toByteArray();
    }
}

*/
