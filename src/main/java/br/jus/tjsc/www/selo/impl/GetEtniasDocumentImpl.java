/*
 * An XML document type.
 * Localname: getEtnias
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEtniasDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEtnias(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEtniasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEtniasDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEtniasDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETETNIAS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEtnias");
    
    
    /**
     * Gets the "getEtnias" element
     */
    public br.jus.tjsc.www.selo.GetEtnias getGetEtnias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEtnias target = null;
            target = (br.jus.tjsc.www.selo.GetEtnias)get_store().find_element_user(GETETNIAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEtnias" element
     */
    public void setGetEtnias(br.jus.tjsc.www.selo.GetEtnias getEtnias)
    {
        generatedSetterHelperImpl(getEtnias, GETETNIAS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEtnias" element
     */
    public br.jus.tjsc.www.selo.GetEtnias addNewGetEtnias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEtnias target = null;
            target = (br.jus.tjsc.www.selo.GetEtnias)get_store().add_element_user(GETETNIAS$0);
            return target;
        }
    }
}
