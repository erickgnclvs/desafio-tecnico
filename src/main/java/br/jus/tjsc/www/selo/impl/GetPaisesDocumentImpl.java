/*
 * An XML document type.
 * Localname: getPaises
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetPaisesDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getPaises(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetPaisesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetPaisesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetPaisesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPAISES$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getPaises");
    
    
    /**
     * Gets the "getPaises" element
     */
    public br.jus.tjsc.www.selo.GetPaises getGetPaises()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetPaises target = null;
            target = (br.jus.tjsc.www.selo.GetPaises)get_store().find_element_user(GETPAISES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPaises" element
     */
    public void setGetPaises(br.jus.tjsc.www.selo.GetPaises getPaises)
    {
        generatedSetterHelperImpl(getPaises, GETPAISES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getPaises" element
     */
    public br.jus.tjsc.www.selo.GetPaises addNewGetPaises()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetPaises target = null;
            target = (br.jus.tjsc.www.selo.GetPaises)get_store().add_element_user(GETPAISES$0);
            return target;
        }
    }
}
