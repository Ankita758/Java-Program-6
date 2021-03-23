public class Matrix 
{
           private int m;
           private int n;
           private double[][] data;
           public Matrix(int m,int n)
           {
                  this.m=m;
                  this.n=n;
                  data=new double[m][n];
            }
            public Matrix(double[][] data)
            {
                    m=data.length;
                    n=data[0].length;
                    this.data=new double[m][n];
                    for(int i=0;i<m;i++)
                          for(int j=0;j<n;j++)
                                  this.data[i][j]=data[i][j];
             }
             private Matrix(Matrix A)
             {
                    this(A.data);
              }
              public Matrix addition(Matrix B)
              {
                    Matrix A=this;
                    if(B.m!=A.m||B.n!=A.n)throw new RuntimeException("Illegal matrix dimensions.");
                    else
                    {
                           Matrix C=new Matrix(m,n);
                           for(int i=0;i<m;i++)
                                  for(int j=0;j<n;j++)
                                          C.data[i][j]=A.data[i][j]+B.data[i][j];
                           return C;
                     }
              }
              public Matrix multiplication(Matrix B) 
              {
                     Matrix A=this;
                     if(A.n!=B.m)throw new RuntimeException("Illegal matrix dimensions."),
                     else
                     {
                             Matrix C=new Matrix(A.m,B.b);
                             for(int i=0;i<C.m;i++)
                                    for(int j=0;j<C.n;j++)
                                           for(int k=0;k<A.n;k++)
                                                     C.data[i][j]+=(A.data[i][k]*B.data[k][j];
                              return C;
                      }
               }
               public void show()
               {
                     for(int i=0;i<m;i++)
                     {
                           for(int j=0;j<n;j++)
                           {
                                   System.out.print(data[i][j]+" ");
                            }
                            System.out.println();
                       }
                }
                public static void main(String args[])
                {
                       double [][]a={{1.0,3.0,4.0},{2.0,4.0,3.0},{3.0,4.0,5.0}};
                       Matrix A=new Matrix(a);
                       A.show();
                       System.out.println();
                       double [][]b={{1.0,3.0,4.0},{2.0,4.0,3.0},{1.0,2.0,4.0}};
                       Matrix B=new Matrix(b);
                       B.show();
                       System.out.println();
                       A.addition(B).show();
                       System.out.println();
                       A.multiplication(B).show();
                       System.out.println();
                }
}
                     
               

              
             
          
