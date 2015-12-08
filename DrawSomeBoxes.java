/*
 * By: Alex Thoennes
 * The long astrix line is to show where 
 * the original boxes end and the stack begins.
 */


public class DrawSomeBoxes 
{
	
	public static void main (String[] args)
	{
		drawRectangle();
		System.out.println();
		System.out.println();
		drawConvex();
		System.out.println();
		System.out.println();
		drawConcave();
		System.out.println();
		System.out.println("*************************************************************");
		
		drawRectangle();
		drawConvex();
		drawRectangle();
		drawConcave();
	}
	
	// Following three methods draw a rectangle
	public static void drawRectangle()
	{
		drawRectTop();
		drawRectBottom();
	}
	
	public static void drawRectTop() 
	{
        System.out.println("    +----------+");
        System.out.println("    |          |");
        System.out.println("    |          |");
        System.out.println("    |          |");
        System.out.println("    |          |");
	}
	
	public static void drawRectBottom() 
	{
		System.out.println("    |          |");
        System.out.println("    |          |");
        System.out.println("    |          |");
        System.out.println("    |          |");
        System.out.println("    +----------+");
	}
	
	
	// following three methods draw a convex
	public static void drawConvex() 
	{
		drawConvexTop();
		drawConvexBottom();
	}
	
	public static void drawConvexTop() 
	{
        System.out.println("    +----------+");
        System.out.println("   /            \\");      
        System.out.println("  /              \\");     
        System.out.println(" /                \\");    
        System.out.println("/                  \\");
	}
	
	public static void drawConvexBottom() 
	{
        System.out.println("\\                  /");
        System.out.println(" \\                /");
        System.out.println("  \\              /");
        System.out.println("   \\            /");
        System.out.println("    \\          /");
        System.out.println("    +----------+");
	}
	
	// Following three methods draw a concave
	public static void drawConcave() 
	{
		drawConcaveTop();
		drawConcaveBottom();
	}
	
	public static void drawConcaveTop() 
	{
        System.out.println("    +----------+");
        System.out.println("    \\          /");
        System.out.println("     \\        /");
        System.out.println("      \\      /");
        System.out.println("       \\    /");
	}
	
	public static void drawConcaveBottom() 
	{
        System.out.println("       /    \\");
        System.out.println("      /      \\");
        System.out.println("     /        \\");
        System.out.println("    /          \\");
        System.out.println("    +----------+");
	}
	
}
