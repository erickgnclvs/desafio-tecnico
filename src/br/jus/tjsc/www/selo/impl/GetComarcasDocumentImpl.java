/*
 * An XML document type.
 * Localname: getComarcas
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetComarcasDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getComarcas(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetComarcasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetComarcasDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetComarcasDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMARCAS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getComarcas");
    
    
    /**
     * Gets the "getComarcas" element
     */
    public br.jus.tjsc.www.selo.GetComarcas getGetComarcas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetComarcas target = null;
            target = (br.jus.tjsc.www.selo.GetComarcas)get_store().find_element_user(GETCOMARCAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getComarcas" element
     */
    public void setGetComarcas(br.jus.tjsc.www.selo.GetComarcas getComarcas)
    {
        generatedSetterHelperImpl(getComarcas, GETCOMARCAS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getComarcas" element
     */
    public br.jus.tjsc.www.selo.GetComarcas addNewGetComarcas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetComarcas target = null;
            target = (br.jus.tjsc.www.selo.GetComarcas)get_store().add_element_user(GETCOMARCAS$0);
            return target;
        }
    }
}
