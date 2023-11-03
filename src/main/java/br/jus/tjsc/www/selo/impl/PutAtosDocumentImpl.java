/*
 * An XML document type.
 * Localname: putAtos
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.PutAtosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one putAtos(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class PutAtosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.PutAtosDocument
{
    private static final long serialVersionUID = 1L;
    
    public PutAtosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUTATOS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "putAtos");
    
    
    /**
     * Gets the "putAtos" element
     */
    public br.jus.tjsc.www.selo.PutAtos getPutAtos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.PutAtos target = null;
            target = (br.jus.tjsc.www.selo.PutAtos)get_store().find_element_user(PUTATOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "putAtos" element
     */
    public void setPutAtos(br.jus.tjsc.www.selo.PutAtos putAtos)
    {
        generatedSetterHelperImpl(putAtos, PUTATOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "putAtos" element
     */
    public br.jus.tjsc.www.selo.PutAtos addNewPutAtos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.PutAtos target = null;
            target = (br.jus.tjsc.www.selo.PutAtos)get_store().add_element_user(PUTATOS$0);
            return target;
        }
    }
}
