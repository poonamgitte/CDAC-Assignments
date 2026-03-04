package cdac;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerateClass {

	public static void main(String[] args) {

		// Accept Package Name
		System.out.println("Enter the package name(e.g. cdac.org):");
		String packageName = ConsoleInput.getString();

		// Accept Class name
		System.out.println("Enter the class name:");
		String className = ConsoleInput.getString();

		String dataMember = null;
		String method = null;
		int choice;
		do {

			System.out.println("1.Field");
			System.out.println("2.Method");
			System.out.println("3.Generate Class");
			System.out.println("Enter choice:");
			choice = ConsoleInput.getInteger();

			switch (choice) {
			case 1: {
				// Accept No of variables
				System.out.println("Enter no of varibles you want to add:");
				int varCount = ConsoleInput.getInteger();

				for (int iTemp = 0; iTemp < varCount; iTemp++) {
					System.out.println("Enter Data type:");
					String dataType = ConsoleInput.getString();

					// Accept Access Specifier
					String accessSpecifier = "";
					System.out.println("Enter choice\na.public b.default");
					String ch = ConsoleInput.getString();

					if (ch.equals("a")) {
						accessSpecifier = "public";
					} else if (ch.equals("b")) {
						accessSpecifier = "default";
					}

					System.out.println("Enter variable name:");
					String varName = ConsoleInput.getString();

					StringBuffer buffer = new StringBuffer(accessSpecifier);
					buffer.append(" ");
					buffer.append(dataType);
					buffer.append(" ");
					buffer.append(varName);
					buffer.append(";");

					dataMember = buffer.toString();

					// System.out.println(dataMember);
				}
			}
				break;
			case 2: {
				// Accept No of methods
				System.out.println("Enter no of methods you want to add:");
				int methodCount = ConsoleInput.getInteger();

				for (int iTemp = 0; iTemp < methodCount; iTemp++) {

					// Accept Access Specifier
					String accessSpecifier = "";
					System.out.println("Enter choice\na.public b.default");
					String ch = ConsoleInput.getString();

					if (ch.equals("a")) {
						accessSpecifier = "public";
					} else if (ch.equals("b")) {
						accessSpecifier = "default";
					}

					System.out.println("Enter return type:");
					String returnType = ConsoleInput.getString();

					System.out.println("Enter method name:");
					String methodName = ConsoleInput.getString();

					System.out.println("Enter no of parameters:");
					int argCount = ConsoleInput.getInteger();

					StringBuffer buffer = new StringBuffer(accessSpecifier);
					buffer.append(" ");
					buffer.append(returnType);
					buffer.append(" ");
					buffer.append(methodName);
					buffer.append("(");

					// Accept No of arguments
					String argType;
					String argName;
					for (int arg = 1; arg <= argCount; arg++) {

						System.out.println("Enter Data type:");
						argType = ConsoleInput.getString();

						System.out.println("Enter argument name:");
						argName = ConsoleInput.getString();

						buffer.append(argType);
						buffer.append(" ");
						buffer.append(argName);

						if (arg < argCount) {
							buffer.append(",");
						}
					}
					buffer.append(");");
					method = buffer.toString();

					// System.out.println(method);
				}
			}
				break;

			case 3: {
				StringBuffer buffer = new StringBuffer("import ");
				buffer.append(packageName);
				buffer.append(";\npublic class ");
				buffer.append(className);
				buffer.append("{\n\n");
				buffer.append(dataMember);
				buffer.append("\n\n");
				buffer.append(method);
				buffer.append("\n}");

				String classData = buffer.toString();
				
				File objFile=new File("C:\\Users\\dac\\Documents\\Batch2\\Java\\Day10\\src\\"+packageName+"\\"+className+".java");
				try {
					objFile.createNewFile();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				try (PrintWriter writer = new PrintWriter(objFile)) {
					writer.print(classData);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				System.out.println(classData);
				
			}
			}
		} while (choice != 3);

	}
}
