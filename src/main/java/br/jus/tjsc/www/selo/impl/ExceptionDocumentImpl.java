/*
 * An XML document type.
 * Localname: Exception
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.ExceptionDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one Exception(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class ExceptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.ExceptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExceptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCEPTION$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception");
    
    
    /**
     * Gets the "Exception" element
     */
    public br.jus.tjsc.www.selo.Exception getException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Exception target = null;
            target = (br.jus.tjsc.www.selo.Exception)get_store().find_element_user(EXCEPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Exception" element
     */
    public void setException(br.jus.tjsc.www.selo.Exception exception)
    {
        generatedSetterHelperImpl(exception, EXCEPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Exception" element
     */
    public br.jus.tjsc.www.selo.Exception addNewException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Exception target = null;
            target = (br.jus.tjsc.www.selo.Exception)get_store().add_element_user(EXCEPTION$0);
            return target;
        }
    }
}
